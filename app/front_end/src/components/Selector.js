import React from 'react';

const Selector = (props) => {

  function handleSubmit(evt){
    evt.preventDefault();
    props.handleSelect(evt.target.ingredient.value);
  }

  let ingredientOptions = props.ingredients.map( (ingredient, index) => {
    return <option key = {index} value = {ingredient._links.self.href}>{ingredient.name}</option>
  });

  return(
    <div>
      <form onSelect = {handleSubmit}>
        <select name = "ingredient" id = "selector">
          {ingredientOptions}
        </select>
      </form>
    </div>
  )
}

export default Selector;
