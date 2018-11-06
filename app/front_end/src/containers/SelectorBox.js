import React, {Component} from 'react';

import Selector from '../components/Selector';
import ReadyButton from '../components/ReadyButton';

class SelectorBox extends Component{
  constructor(props){
    super(props);
    this.state = null;
  }

  render(){
    return(
    <React.Fragment>
      <Selector />
      <ReadyButton />
    </React.Fragment>
    )
  }
}

export default SelectorBox;
