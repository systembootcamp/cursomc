package com.lucasgomes.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.lucasgomes.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Date dataVenciemento;
	private Date dataPagamento;

	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVenciemento = dataVencimento;
	}

	public Date getDataVenciemento() {
		return dataVenciemento;
	}

	public void setDataVenciemento(Date dataVenciemento) {
		this.dataVenciemento = dataVenciemento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
