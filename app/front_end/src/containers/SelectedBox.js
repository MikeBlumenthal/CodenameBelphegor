import React, {Component} from 'react';

import SelectedDisplay from '../components/SelectedDisplay';

class SelectedBox extends Component {


  render(){

    const selectedIngredients = this.props.selected.map( (ingredient)=>{
      return (
        <li key={ingredient.id}>
          <SelectedDisplay ingredient = {ingredient} />
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
