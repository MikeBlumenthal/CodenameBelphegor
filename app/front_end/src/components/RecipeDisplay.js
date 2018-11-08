import React, {Component} from 'react';

class RecipeDisplay extends Component {

  process(string){
    const splitStr = string.split(",");
    return splitStr;
  }

  render(){

    let cocktail = this.props.location.state.cocktail;

    let contents = this.process(cocktail.contents);
    let list = contents.map((content, index) => {
      return <li key = {index}>{content}</li>
    } )

    return(
      <div>
        <h2>{cocktail.name}</h2>
        {list}
        <p>{cocktail.recipe}</p>
        <iframe src = {cocktail.song}></iframe>

      </div>
    )
  }
}

export default RecipeDisplay;
