import React, {Component} from 'react';

import Selector from '../components/Selector';
import SelectedBox from './SelectedBox';
import ReadyButton from '../components/ReadyButton';


class SelectionBox extends Component {
  constructor(props){
    super(props);
    this.state = { selected: []};
    this.handleSelect = this.handleSelect.bind(this);
  }

  handleSelect(data){
    let newStateSelected = this.state.selected;
    let id = data.id;
    if (!((this.state.selected.findIndex(current => current.id === id) >= 0)) )
    {
      newStateSelected.push(data);
      this.setState({selected: newStateSelected})
    }
  }

  render(){
    console.log("TOPSTATE:", this.state.selected);
    return(
      <React.Fragment>
        <ReadyButton selected= {this.state.selected} />
        <Selector handleSelect = {this.handleSelect} />
        <SelectedBox selected = {this.state.selected} />
      </React.Fragment>
    )
  }
}

export default SelectionBox;
