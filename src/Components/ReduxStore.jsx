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

// store creation 
const CounterStore = configureStore({
    reducer: {
        counter: CounterSlice.reducer
    }
})

export const CounterAction = CounterSlice.actions;
export default CounterStore;