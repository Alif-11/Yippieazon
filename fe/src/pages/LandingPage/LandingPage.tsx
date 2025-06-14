import "./LandingPage.css";
import Header from "../../components/Header";

export default function LandingPage() {
  return (
    <>
      <Header />
      <div className="flex flex-col items-center justify-center h-screen">
        <h1 className="text-4xl font-bold">Yippieazon</h1>
        <p className="text-2xl">Your one-stop shop for all your needs</p>
      </div>
    </>
  );
}
