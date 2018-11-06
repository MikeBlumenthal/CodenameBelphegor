import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import './App.css';
import Header from './components/Header';

class App extends Component {
  render() {
    return (
      <Router >
        <React.Fragment>
          <Header />
        </React.Fragment>
      </Router>
    );
  }
}

export default App;
