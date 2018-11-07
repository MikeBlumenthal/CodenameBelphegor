import React, {Component} from 'react';

class Selector extends Component {
  constructor(props){
    super(props);
  }

  render(){

    let ingredientOptions = this.props.ingredients.map( (ingredient, index) => {
      return <option key = {index} value = {ingredient.id}>{ingredient.name}</option>
    });

    return(
      <div>
        <form>
          <select name = 'WHAT YOU GOT'>
            {ingredientOptions}
          </select>
        </form>
      </div>
    )
  }
}

export default Selector;
