import React, {Component} from 'react';

import Selector from '../components/Selector';
import ReadyButton from '../components/ReadyButton';
import Request from '../helpers/Request';

class SelectorBox extends Component{
  constructor(props){
    super(props);
    this.state = { ingredients: [] };
  }

  componentDidMount(){
    let request = new Request()
    request.get('/api/ingredients').then((data) => {
      this.setState({ingredients: data._embedded.ingredients})
    });
  }

  render(){
    return(
    <React.Fragment>
      <Selector ingredients = {this.state.ingredients} handleSelect = {this.props.handleSelect} />
      <ReadyButton />
    </React.Fragment>
    )
  }
}

export default SelectorBox;
