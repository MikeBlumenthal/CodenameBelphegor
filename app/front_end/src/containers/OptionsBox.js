import React from 'react';
import OptionDisplay from '../components/OptionDisplay';

const OptionsBox = (props)=> {
  if(props.location.state.selected.length < 1){
    return(
      <h3>I'm so sorry...You're going to have to drink it neat...</h3>
    )
  }
  let cocktailOptions = 
  return(
    <React.Fragment>
      <OptionDisplay />
    </React.Fragment>
  )
}


export default OptionsBox;
