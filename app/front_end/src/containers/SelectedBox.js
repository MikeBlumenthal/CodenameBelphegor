import React, {Component} from 'react';

import SelectedDisplay from '../components/SelectedDisplay';

class SelectedBox extends Component {
  constructor(props){
    super(props);
    this.state = null;
  }

  render(){
    console.log("SELECTED BOX:", this.props);

    const selectedIngredients = this.props.selected.map( (ingredient, index)=>{
      return (
        <li key={index}>
          <SelectedDisplay ingredient = {ingredient} handleDelete = {this.props.handleDelete}/>
        </li>
      )
    });

  return(
    <React.Fragment>
      <ul>
        {selectedIngredients}
      </ul>
    </React.Fragment>
  )
}

}

export default SelectedBox;
