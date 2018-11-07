import React from 'react';
import OptionDisplay from '../components/OptionDisplay';

const OptionsBox = (props)=> {
  if(props.location.state.selected.length < 1){
    return(
      <h3>I'm so sorry...You're going to have to drink it neat...</h3>
    )
  }

  let cocktailOptions = props.location.state.selected.map( (thing, index)=>{
    return <OptionDisplay key = {index} data = {thing}/>
  })

  return(
    <React.Fragment>
      {cocktailOptions}
    </React.Fragment>
  )
}


export default OptionsBox;
