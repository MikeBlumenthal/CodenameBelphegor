import React, {Component} from 'react';
import OptionDisplay from '../components/OptionDisplay';
import Request from '../helpers/Request';

class OptionsBox extends Component {

  componentDidMount(){
    console.log("MOUNTED");
    let request = new Request();
    // request.get('/api/ingredients').then((data) => {
    //   this.setState({ingredients: data._embedded.ingredients})
    // });
  }

  render(){
    console.log(this.props.location.state.selected);
    if(this.props.location.state.selected < 1){
      return(
        <h3>I'm so sorry...You're going to have to drink it neat...</h3>
      )
    }

    let cocktailOptions = this.props.location.state.selected.map( (ingredient, index)=>{
      return <OptionDisplay key = {index} data = {ingredient} />
    })
    return(
      <React.Fragment>
        <h2>options box</h2>
        {cocktailOptions}
      </React.Fragment>
    )
  }
}

export default OptionsBox;
