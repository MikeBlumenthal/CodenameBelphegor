import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class ReadyButton extends Component {
  constructor(props){
    super(props);
  }

  render(){
    let data = this.props;
    return(
      <Link to = {{ pathname: '/options', state: data }}>GO TO OPTIONS</Link>

    )
  }
}

export default ReadyButton;
