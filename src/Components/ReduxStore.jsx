// this is the demo of command to check the pull request of git hub 

import { useState } from 'react';
import { configureStore, createSlice } from '@reduxjs/toolkit'


// slice creation 
const CounterSlice = createSlice({
    name: 'counter',
    initialState: { CounterVal: 0 },
    reducers: {
        increment: (state) => {
            state.CounterVal++;
        },
        decrement: (state) => {
            state.CounterVal--;
        },
        add: (state, action) => {
            state.CounterVal += Number(action.payload.Num);
        },
        sub: (state, action) => {
            state.CounterVal -= Number(action.payload.Num);
        }
    }
})
const demo = () => {
    const [counter, counterstate] = useState(0);
}

// store creation 
const CounterStore = configureStore({
    reducer: {
        counter: CounterSlice.reducer
    }
})

export const CounterAction = CounterSlice.actions;
export default CounterStore;