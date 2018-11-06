import React from 'react';
import {Link} from 'react-router-dom';

const Header = (props)=>{
  return (
    <header>
      <h1>Your Spirit Guide</h1>
      <h2>
        <Link to = '/selection'>Choose your booze...</Link>
      </h2>
    </header>
  )
}

export default Header;
