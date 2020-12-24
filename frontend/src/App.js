import React from 'react'
import './App.css'
import Home from './Home/Home'

function App() {
  const headerProps = {
    title: 'Loja Michele'
  };
  return (
    <div className="App">
      <main className="App-content">
        <Home/>
      </main>
    </div>
  );
}
export default App
