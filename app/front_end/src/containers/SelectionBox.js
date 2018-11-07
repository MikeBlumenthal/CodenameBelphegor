import React, {Component} from 'react';

import SelectorBox from './SelectorBox';
import SelectedBox from './SelectedBox';


class SelectionBox extends Component {
  constructor(props){
    super(props);
    this.state = { selected: [] };
    this.handleSelect = this.handleSelect.bind(this);
  }

  handleSelect(ingredient){
    let newStateSelected = this.state.selected;
    newStateSelected.push(ingredient);
    this.setState({selected: newStateSelected})
  }

  render(){
    return(
    <React.Fragment>
      <SelectorBox handleSelect = {this.handleSelect}/>
      <SelectedBox selected = {this.state.selected} />
    </React.Fragment>
    )
  }
}

export default SelectionBox;
