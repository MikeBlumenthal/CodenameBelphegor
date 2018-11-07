import React, {Component} from 'react';
import Request from '../helpers/Request';

class Selector extends Component {

  constructor(props){
    super(props);
    this.state = {ingredients:[]};
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  componentDidMount(){
    let request = new Request()
    request.get('/api/ingredients').then((data) => {
      this.setState({ingredients: data._embedded.ingredients})
    });
  }

  handleSubmit(evt){
    evt.preventDefault();
    const data = JSON.parse(evt.target.ingredient.value);
    this.props.handleSelect(data);
  }

  render(){

    const ingredientOptions = this.state.ingredients.map( (ingredient, index) => {
      return(
        <option
          key = {index}
          value = {JSON.stringify(ingredient)}
          >{ingredient.name}
        </option>
      )
    });

    return(
      <React.Fragment>
        <div>
          <form onSubmit={this.handleSubmit}>
            <select name = "ingredient">
              {ingredientOptions}
            </select>
            <button type="submit">Go</button>
          </form>
        </div>
      </React.Fragment>
    )
  }
}
export default Selector;
