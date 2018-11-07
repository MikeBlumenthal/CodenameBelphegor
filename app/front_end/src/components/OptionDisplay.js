import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class OptionDisplay extends Component {
  constructor(props){
    super(props);
    this.state = null;
  }

  render(){
    return(
      <h1>{this.props.data}</h1>

      // <Link to = '/drink/1'>COCKTAIL OPTION</Link>
    )
  }
}

export default OptionDisplay;
