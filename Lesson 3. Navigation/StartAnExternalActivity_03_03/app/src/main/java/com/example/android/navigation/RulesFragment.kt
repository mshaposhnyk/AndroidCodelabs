/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentRulesBinding

class RulesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val binding = DataBindingUtil.inflate<FragmentRulesBinding>(inflater,R.layout.fragment_rules,container,false)
        binding.playButton.setOnClickListener { view : View ->
            view.findNavController().navigate(RulesFragmentDirections.actionRulesFragmentToGameFragment())
        }
        Log.i("RulesFragment", "onCreateView called")
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("RulesFragment", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("RulesFragment", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("RulesFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("RulesFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("RulesFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("RulesFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("RulesFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("RulesFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("RulesFragment", "onDetach called")
    }
}
