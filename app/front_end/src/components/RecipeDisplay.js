import React, {Component} from 'react';

class RecipeDisplay extends Component {


  render(){
    const cocktail = this.props.location.state.cocktail;
    console.log(cocktail);
    return(
      <div>
        <h3>i am a {cocktail.name}</h3>
        <p>{cocktail.recipe}</p>
        <iframe src = {cocktail.song}></iframe>

      </div>
    )
  }
}

export default RecipeDisplay;
