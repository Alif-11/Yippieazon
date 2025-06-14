[Following this guide to build a React, Spring Boot, and PostgreSQL app (you're also going to add in Tailwind CSS)](https://dev.to/mspilari/fullstack-app-building-the-front-end-with-vite-react-typescript-hooks-and-docker-3i63)

[Now we are on this part of the tutorial, at the 3. Models directory part of the page](https://dev.to/mspilari/fullstack-app-developing-the-back-end-with-spring-boot-and-postgresql-bbk)

[The UI and service you are trying to replicate](https://www.amazon.com)

This app is intended to be an Amazon clone called Yippieazon. Everytime you add an item to your cart, you get a "Yippie!" sound effect. Everytime you remove an item from your cart, you get an "Oh no!" sound effect.

The tech stack for this application will be:
 React and Vite for the Frontend.
 Spring Boot for the Backend. [NOT ADDED YET]
 PostgreSQL for the Database. [NOT ADDED YET]
 Tailwind CSS for styling. [NOT ADDED YET]
 React-Router for routing assistance. [NOT ADDED YET]
 Docker for containerization and hosting. [NOT ADDED YET]

Code to run the fe/ folder frontend:
```npm run dev```

To use Tailwind CSS for a particular piece CSS file, add
```@import "tailwindcss";``` 
at the top. You will then be able to use Tailwind CSS classes in the corresponding components or pages file.

# Useful for React Router work on the frontend:



1. Setting up the Router:
In your main entry file (usually index.js or main.jsx), wrap your entire app with a BrowserRouter component:
Code

     import React from 'react';
     import ReactDOM from 'react-dom/client';
     import { BrowserRouter } from 'react-router-dom';
     import App from './App';

     const root = ReactDOM.createRoot(document.getElementById('root'));
     root.render(
       <React.StrictMode>
         <BrowserRouter>
           <App />
         </BrowserRouter>
       </React.StrictMode>
     );

2. Defining Routes:
Inside your App.js or a similar component, use Routes and Route components to define your application's routes.
Each Route associates a URL path with a specific component to render:
Code

     import React from 'react';
     import { Routes, Route } from 'react-router-dom';
     import Home from './components/Home';
     import About from './components/About';
     import Contact from './components/Contact';
     
     function App() {
       return (
         <Routes>
           <Route path="/" element={<Home />} />
           <Route path="/about" element={<About />} />
           <Route path="/contact" element={<Contact />} />
         </Routes>
       );
     }
     
     export default App;

3. Navigating between pages:
Use the Link component for declarative navigation (creating links):
Code

     import React from 'react';
     import { Link } from 'react-router-dom';
     
     function Navigation() {
       return (
         <nav>
           <Link to="/">Home</Link>
           <Link to="/about">About</Link>
           <Link to="/contact">Contact</Link>
         </nav>
       );
     }
     
     export default Navigation;
Use the useNavigate hook for programmatic navigation (e.g., after form submission):
Code

     import React from 'react';
     import { useNavigate } from 'react-router-dom';
     
     function SubmitButton() {
       const navigate = useNavigate();
     
       const handleClick = () => {
         // Perform some action
         navigate('/about');
       };
     
       return (
         <button onClick={handleClick}>Go to About</button>
       );
     }
     
     export default SubmitButton;

4. Using Routes within Components:
You can nest Routes and Route components within other components to create more complex layouts or nested navigation.
The path prop in Route can include dynamic segments (e.g., /users/:id) to match different URLs and extract parameters.

5. Layouts:
To create a consistent layout across multiple pages, you can create a layout component that wraps the Routes component:
Code

     import React from 'react';
     import Navigation from './Navigation';
     
     function Layout({ children }) {
       return (
         <div>
           <Navigation />
           <main>{children}</main>
         </div>
       );
     }

     export default Layout;
Then use it in your main App.js file:
Code

       import React from 'react';
       import { Routes, Route } from 'react-router-dom';
       import Home from './components/Home';
       import About from './components/About';
       import Contact from './components/Contact';
       import Layout from './Layout';
       
       function App() {
         return (
           <Layout>
             <Routes>
               <Route path="/" element={<Home />} />
               <Route path="/about" element={<About />} />
               <Route path="/contact" element={<Contact />} />
             </Routes>
           </Layout>
         );
       }
       
       export default App;