const express = require('express');

class App {
  constructor () {
    this.express = express();
    this.isDev = process.env.NODE_ENV === 'production';

    this.middlewares();
    this.views();
    this.routes();
  }

  middlewares () {

  }
}

views() {

}

routes(){

}
}
