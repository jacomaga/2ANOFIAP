package loja.pedido.handler;

import java.util.ArrayList;
import java.util.List;

import loja.Pedido;
import loja.pedido.listener.Listener;

public class SituacaoHandler {

	private List<Listener> listeners;
	
	 
	public SituacaoHandler() {
		this.listeners = new ArrayList<Listener>();
	}

	public void inscrever(Listener listener) {
		listeners.add(listener);
	}
	
	public void desinscrever(Listener listener) {
		listeners.remove(listener);
	}
	
	public void notify(Pedido pedido) {
		listeners.forEach(listener -> listener.update(pedido));
	}
}
