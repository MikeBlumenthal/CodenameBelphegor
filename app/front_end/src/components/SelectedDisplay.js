import React, {Component} from 'react';

class SelectedDisplay extends Component{
  render(){
    return(
      <h3>I have been chosen. I am {this.props.ingredient}</h3>
    )
  }
}

export default SelectedDisplay;
