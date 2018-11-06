import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import './App.css';

import Header from './components/Header';
import RecipeDisplay from './components/RecipeDisplay';

import SelectionBox from './containers/SelectionBox';
import OptionsBox from './containers/OptionsBox';

class App extends Component {
  render() {
    return (
      <Router >
        <React.Fragment>
          <Header />
          <Switch>
            <Route exact path = '/selection' component = {SelectionBox} />
            <Route exact path = '/options' component = {OptionsBox} />
            <Route exact path= '/drink/:id' render = {(props) => {
            const id = props.match.params.id;
            return <RecipeDisplay id = {id} />
            }}
          />
          </Switch>
        </React.Fragment>
      </Router>
    );
  }
}

export default App;
