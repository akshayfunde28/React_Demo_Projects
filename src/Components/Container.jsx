

export default function Container({ children }) {
    return <>
        <center>
            <div className="col-md-6">
                <div className="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                    {children}
                </div>
            </div>
        </center>
    </>
}