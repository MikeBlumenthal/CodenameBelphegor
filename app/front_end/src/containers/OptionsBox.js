import React, {Component} from 'react';

import OptionDisplay from '../components/OptionDisplay';

class OptionsBox extends Component {
  constructor(props){
    super(props);
    this.state = null;
  }

  render(){
    return(
    <React.Fragment>
      <OptionDisplay />
    </React.Fragment>
    )
  }
}

export default OptionsBox;
