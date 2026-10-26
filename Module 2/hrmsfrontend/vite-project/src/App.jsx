import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import SampleCode from './component/Samplecode'
import UseFetchApi from './component/UseFetchApi'

function App() {
  // const employee=[{
  //   ename:"Amit",
  //   empid:"12345"
  // },
  // {
  //   ename:"Anil",
  //   empid:"1234"
  // },
  // {
  //   ename:"Anshul",
  //   empid:"1235"
  // },
  // {
  //   ename:"Atul",
  //   empid:"1345"
  // }]

  return (
    <>
     <SampleCode/>
     <UseFetchApi/>
   
    </>
  )
}

export default App