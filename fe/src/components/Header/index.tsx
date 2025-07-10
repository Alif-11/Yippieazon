import "./Header.css";
import { useNavigate } from "react-router-dom";
import { getCartItems } from "../../lib/api";

type HeaderProps = {
}

export default function Header() {
  const navigate = useNavigate();

  const handleCartClick = async () => {
    const cartItems = await getCartItems("4");
    console.log(cartItems)
  }

  return (
    <>

      <div id="nav-slate-top">
        <div className="flex items-center space-x-4 px-4 w-screen bg-slate-900 h-fit">
          <div className="text-white cursor-pointer" onClick={() => {
            navigate("/");
          }}>
            AMAZON LOGO
          </div>

          <div className="flex-1">
            <input type="text" className="bg-white m-4 py-1.5 rounded-md placeholder:text-gray-700 placeholder:pl-2 w-full" placeholder="Search Yippieazon"></input>
          </div>

          <div
            className="text-white cursor-pointer pr-3 pl-7"
            onClick={handleCartClick}>
            SHOPPING CART
          </div>
        </div>
      </div>

      <div id="nav-dark-below-slate-top">

      </div>
    </>
  )
}