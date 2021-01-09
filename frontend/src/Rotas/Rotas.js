import React from 'react'
import {Route, Switch,HashRouter} from 'react-router-dom'
import Home from '../views/home'
import TableComponent from'../components/Table/Table'
import CadastroCompra from '../views/cadastroUsuario'
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