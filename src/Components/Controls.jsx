import { useState } from "react";
import { useDispatch } from "react-redux";
import { CounterAction } from "./ReduxStore";

const Controls = () => {
    const [num, setNum] = useState(0);
    const dispatch = useDispatch();

    return (
        <div className="container d-flex justify-content-center mt-5">
            <div className="card shadow p-4" style={{ maxWidth: "420px", width: "100%" }}>

                <h4 className="text-center mb-4 fw-bold">
                    Counter Controls
                </h4>

                {/* Increment / Decrement */}
                <div className="d-flex justify-content-center gap-3 mb-4">
                    <button
                        onClick={() => dispatch(CounterAction.increment())}
                        className="btn btn-success btn-lg px-4"
                    >
                        +1
                    </button>

                    <button
                        onClick={() => dispatch(CounterAction.decrement())}
                        className="btn btn-danger btn-lg px-4"
                    >
                        -1
                    </button>
                </div>

                {/* Input */}
                <div className="mb-4">
                    <label className="form-label fw-semibold">
                        Add / Subtract value
                    </label>
                    <input
                        type="number"
                        className="form-control text-center"
                        value={num}
                        onChange={(e) => setNum(Number(e.target.value))}
                    />
                </div>

                {/* Add / Sub */}
                <div className="d-flex justify-content-between gap-3">
                    <button
                        onClick={() => dispatch(CounterAction.add({ Num: num }))}
                        className="btn btn-info w-100 fw-bold"
                    >
                        ADD
                    </button>

                    <button
                        onClick={() => dispatch(CounterAction.sub({ Num: num }))}
                        className="btn btn-warning w-100 fw-bold"
                    >
                        SUB
                    </button>
                </div>

            </div>
        </div>
    );
};

export default Controls;
