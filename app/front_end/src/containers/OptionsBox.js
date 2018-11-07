import React, {Component} from 'react';
// import OptionDisplay from '../components/OptionDisplay';
// import Request from '../helpers/Request';

class OptionsBox extends Component {

  render(){
    // if(this.props.location.state.selected < 1){
    //   return(
    //     <h3>I'm so sorry...You're going to have to drink it neat...</h3>
    //   )
    // }

    // let cocktailOptions = this.props.location.state.selected.map( (thing, index)=>{
    //   return <OptionDisplay key = {index} data = {thing}/>
    // })

    return(
      <React.Fragment>
        <h2>options box</h2>
        {/* {cocktailOptions} */}
      </React.Fragment>
    )
  }
}

export default OptionsBox;
