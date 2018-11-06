import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class ReadyButton extends Component {
  constructor(props){
    super(props);
    this.state = null;
  }

  render(){
    return(
      <Link to = '/options'>GO TO OPTIONS</Link>
    )
  }
}

export default ReadyButton;
