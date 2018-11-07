import React, {Component} from 'react';

import Selector from '../components/Selector';
import SelectedBox from './SelectedBox';
import ReadyButton from '../components/ReadyButton';


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
      <ReadyButton selected= {this.state.selected}/>
      <Selector handleSelect = {this.handleSelect}/>
      <SelectedBox selected = {this.state.selected} />
    </React.Fragment>
    )
  }
}

export default SelectionBox;
