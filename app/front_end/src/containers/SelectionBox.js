import React, {Component} from 'react';

import Selector from '../components/Selector';
import SelectedBox from './SelectedBox';
import ReadyButton from '../components/ReadyButton';


class SelectionBox extends Component {
  constructor(props){
    super(props);
    this.state = { selected: []};
    this.handleSelect = this.handleSelect.bind(this);
    this.handleDelete = this.handleDelete.bind(this);
  }

  handleSelect(data){
    let newStateSelected = this.state.selected;
    let id = data.id;
    if ( !((this.state.selected.findIndex(current => current.id === id) >= 0)))
    {
      newStateSelected.push(data);
      this.setState({selected: newStateSelected})
    }
  }

  handleDelete(obj){
    let newStateSelected = this.state.selected;
    let id = obj.id;
    let index = newStateSelected.findIndex(current => current.id ===id);
    newStateSelected.splice(index, 1);
    this.setState({selected: newStateSelected});
  }

  render(){
    return(
      <React.Fragment>
        <ReadyButton selected= {this.state.selected} />
        <Selector handleSelect = {this.handleSelect} />
        <SelectedBox selected = {this.state.selected} handleDelete = {this.handleDelete}/>
      </React.Fragment>
    )
  }
}

export default SelectionBox;
