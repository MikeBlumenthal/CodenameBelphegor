import React, {Component} from 'react';

class SelectedDisplay extends Component{
  constructor(props){
    super(props);
    this.deleteIngredient = this.deleteIngredient.bind(this);
  }

  deleteIngredient(){
    this.props.handleDelete(this.props.ingredient);
  }

  render(){
    console.log("Selected Display:", this.props.ingredient);
    return(
      <React.Fragment>
        <h3>I, an {this.props.ingredient.name}, has been chosen.</h3>
        <button onClick = {this.deleteIngredient}>X</button>
      </React.Fragment>
    )
  }
}

export default SelectedDisplay;
