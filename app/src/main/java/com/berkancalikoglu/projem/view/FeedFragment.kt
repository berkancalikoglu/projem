package com.berkancalikoglu.projem.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.berkancalikoglu.projem.R
import com.berkancalikoglu.projem.adapter.OtelAdapter
import com.berkancalikoglu.projem.viewmodel.FeedViewModel
import kotlinx.android.synthetic.main.fragment_feed.*

class FeedFragment : Fragment() {

    private lateinit var viewModel : FeedViewModel
    private val otelAdapter = OtelAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(FeedViewModel::class.java)
        viewModel.refreshData()

        otelList.layoutManager = LinearLayoutManager(context)
        otelList.adapter = otelAdapter

        swipeRefreshLayout.setOnRefreshListener {
            otelList.visibility = View.GONE
            otelError.visibility = View.GONE
            otelLoading.visibility = View.VISIBLE
            viewModel.refreshFromAPI()
            swipeRefreshLayout.isRefreshing = false
        }

        observeLiveData()
    }

    private fun observeLiveData() {
        viewModel.otels.observe(viewLifecycleOwner, Observer {otels ->
            otels?.let {
                otelList.visibility = View.VISIBLE
                otelAdapter.updateOtelList(otels)
            }
        })

        viewModel.otelError.observe(viewLifecycleOwner, Observer { error->
            error?.let {
                if(it) {
                    otelError.visibility = View.VISIBLE
                } else {
                    otelError.visibility = View.GONE
                }
            }
        })

        viewModel.otelLoading.observe(viewLifecycleOwner, Observer { loading->
            loading?.let {
                if (it) {
                    otelLoading.visibility = View.VISIBLE
                    otelList.visibility = View.GONE
                    otelError.visibility = View.GONE
                } else {
                    otelLoading.visibility = View.GONE
                }
            }
        })
    }
}