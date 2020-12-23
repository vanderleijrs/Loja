import React from 'react'
import {Route, Switch,HashRouter} from 'react-router-dom'
import Home from '../views/home'
import TableComponent from'../components/Table/Table'
import cadastroUsuario from '../views/cadastroUsuario'
import Compra from '../components/Compra/Compra'
function Rotas(){
    return(
      <HashRouter>
          <Switch>
            <Route path="/Table" component={TableComponent}/>
            <Route path="/Home" component={Home}/>
            <Route path="/cadastroUsuario" component={cadastroUsuario}/>
            <Route path="/Compra" component={Compra}/>
          </Switch>
      </HashRouter>
    )
}
export default Rotas