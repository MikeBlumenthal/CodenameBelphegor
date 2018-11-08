import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class ReadyButton extends Component {

  render(){

    return(
      <Link to = {{ pathname: '/options', state: this.props }}>GO TO OPTIONS</Link>

    )
  }
}

export default ReadyButton;
