import React, {Component} from 'react';

import SelectorBox from './SelectorBox';
import SelectedBox from './SelectedBox';


class SelectionBox extends Component {
  constructor(props){
    super(props);
    this.state = { selected: [] };
  }

  render(){
    return(
    <React.Fragment>
      <SelectorBox />
      <SelectedBox selected = {this.state.selected}/>
    </React.Fragment>
    )
  }
}

export default SelectionBox;
