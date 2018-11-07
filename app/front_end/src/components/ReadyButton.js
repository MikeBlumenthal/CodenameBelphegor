import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class ReadyButton extends Component {

  render(){

    console.log("READY:", this.props);
    return(
      <Link to = {{ pathname: '/options', state: null }}>GO TO OPTIONS</Link>

    )
  }
}

export default ReadyButton;
