import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class OptionDisplay extends Component {
  constructor(props){
    super(props);
    this.state = null;
  }

  render(){
    return(
      <React.Fragment>
      <Link key = {this.props.displayId} to = {{ pathname: ('/drink/' + this.props.cocktail.id), state: this.props.cocktail }}>{this.props.cocktail.name}</Link> 
      <br/>
      </React.Fragment>
    )
  }
}

export default OptionDisplay;
