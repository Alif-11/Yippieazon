import "./Header.css"

type HeaderProps = {
}

export default function Header() {
  return (
    <>

      <div id="nav-slate-top">
        <div className="flex w-screen bg-slate-900 h-fit">
          <div>
            Left
          </div>

          <div className="flex-1">
            <input type="text" className="bg-white m-4 rounded-md placeholder:text-gray-700 placeholder:pl-2" placeholder="Search Yippieazon"></input>
          </div>

          <div>
            Right
          </div>
        </div>
      </div>

      <div id="nav-dark-below-slate-top">

      </div>
    </>
  )
}