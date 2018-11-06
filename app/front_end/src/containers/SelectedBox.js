import React, {Component} from 'react';

import SelectedDisplay from '../components/SelectedDisplay';

class SelectedBox extends Component {
  constructor(props){
    super(props);
    this.state = null;
  }

  render(){
    return(
    <React.Fragment>
      <SelectedDisplay />
    </React.Fragment>
    )
  }
}

export default SelectedBox;
