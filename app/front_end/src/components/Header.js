import React from 'react';
import {Link} from 'react-router-dom';

const Header = (props)=>{
  return (
    <header>
      <img></img>
      <h2>Your Spirit Guide</h2>
      <br/>
      <h4>
        <Link to = '/selection'>Choose your booze...</Link>
      </h4>
    </header>
  )
}

export default Header;
