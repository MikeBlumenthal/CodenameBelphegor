import React, {Component} from 'react';

class SelectedDisplay extends Component{
  render(){
    console.log("Selected Display:", this.props.ingredient);
    return(
      <h3>I, an {this.props.ingredient.name}, has been chosen.</h3>
    )
  }
}

export default SelectedDisplay;
