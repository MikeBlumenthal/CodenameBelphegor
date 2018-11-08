import React, {Component} from 'react';
import OptionDisplay from '../components/OptionDisplay';
import Request from '../helpers/Request';

class OptionsBox extends Component {

  constructor(props){
    super(props);
    this.state = { cocktails: [] };
    this.processOptions = this.processOptions.bind(this);
  }

  processOptions(options){
    let processedOptions = [];
    options.forEach( option => processedOptions = [...processedOptions, ...option]);
    return processedOptions;
  }

  componentDidMount(){
    const urlArray = this.props.location.state.selected.map(element => {
      return `/ingredients/getcocktails/${element.id}`});
      urlArray.forEach( url => {
        let request = new Request();
        request.get( url )
        .then( (data) => {
          let newState = this.state.cocktails;
          newState.push(data);
          this.setState({cocktails: newState});
        })
      })
    }


    render(){
      if(this.state.cocktails.length < 1){
        return(
          <h3>I'm sorry...we have no recipes for that...You're going to have to drink it neat...</h3>
        )
      }

      let cocktailOptions = this.processOptions(this.state.cocktails).map((cocktail, index)=>{
        return<OptionDisplay key = {index} cocktail={cocktail} />
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
