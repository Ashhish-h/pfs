import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import SignUpPage from './Pages/SignUpPage'
import LoginPage from './Pages/LoginPage'
import { BrowserRouter } from 'react-router'

function App() {


  return (
    <>
      <SignUpPage />
      <LoginPage />
    </>
  )
}

export default App
