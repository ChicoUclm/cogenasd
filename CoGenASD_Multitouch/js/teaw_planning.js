var $ = go.GraphObject.make;

// Diagrama que recibirá los nodos y enlaces
var diagrama = $(go.Diagram, "divDiagrama",
	{
		"toolManager.mouseWheelBehavior": go.ToolManager.WheelZoom,
		"grid.background": "white",
		layout: $(go.GridLayout,
			{ comparer: go.GridLayout.smartComparer,
				spacing: new go.Size(32,32),
				wrappingColumn: 20,
				wrappingWidth: 99999,
			 })
	});
	diagrama.isReadOnly = true;
	
	
	/***
		NODOS
	***/	
	// Plantilla para definir un nodo de tipo figura
	// En este caso, una figura y debajo un texto
	var plantillaNodoImagen =
	$(go.Node, "Spot",
		$(go.Panel, "Vertical",
			$(go.Picture,
				{ desiredSize: new go.Size(64, 64) },
			new go.Binding("source"),
			new go.Binding("desiredSize")),
			$(go.TextBlock,
				{
					font: "14pt sans-serif, Arial, Helvetica",
					margin: 20,
					maxSize: new go.Size(256-16, NaN),
					wrap: go.TextBlock.WrapFit,
					editable: true,
					//textAlign: "center"
				},
			new go.Binding("text").makeTwoWay())
		)
	);

	// Plantilla para definir un nodo de tipo figura + texto
	// En este caso, una figura con un borde y debajo un texto
	var plantillaPictoAccion =
	$(go.Node, "Vertical",
		$(go.Panel, "Auto",
			$(go.Shape, "Rectangle", { width: 256+16, height: 256+16, strokeWidth: 0, fill: 'rgb(255,235,59)' } ),
			$(go.Picture,
				{ desiredSize: new go.Size(64, 64) },
				new go.Binding("source"),
				new go.Binding("desiredSize"))),
			$(go.TextBlock,
				{
					font: "14pt sans-serif, Arial, Helvetica",
					margin: 20,
					maxSize: new go.Size(256-16, NaN),
					wrap: go.TextBlock.WrapFit,
					editable: true,
					//textAlign: "center"
				},
			new go.Binding("text").makeTwoWay())
	);

	var plantillaPictoPersona =
	$(go.Node, "Vertical",
		$(go.Panel, "Auto",
			$(go.Shape, "Rectangle", { width: 256+16, height: 256+16, strokeWidth: 0, fill: 'rgb(33, 150, 243)' } ),
			$(go.Picture,
				{ desiredSize: new go.Size(64, 64) },
				new go.Binding("source"),
				new go.Binding("desiredSize"))),
			$(go.TextBlock, 
				{
					font: "14pt Arial, sans-serif, Helvetica",
					margin: 20,
					maxSize: new go.Size(256-16, NaN),
					wrap: go.TextBlock.WrapFit,
					//textAlign: "center"
				},
			new go.Binding("text").makeTwoWay())
	);

	var plantillaPictoLugar =
	$(go.Node, "Vertical",
		$(go.Panel, "Auto",
			$(go.Shape, "Rectangle", { width: 256+16, height: 256+16, strokeWidth: 0, fill: 'rgb(76, 175, 80)' } ),
			$(go.Picture,
				{ desiredSize: new go.Size(64, 64) },
				new go.Binding("source"),
				new go.Binding("desiredSize"))),
			$(go.TextBlock,
				{
					font: "14pt Arial, sans-serif, Helvetica",
					margin: 20,
					maxSize: new go.Size(256-16, NaN),
					wrap: go.TextBlock.WrapFit,
					editable: true,
					//textAlign: "center"
				},
			new go.Binding("text").makeTwoWay())
	);
	
	
	// Como se hace uso de diferentes plantillas de nodos es necesario guardarlas y asociarlas al diagrama
	var plantillasNodos = new go.Map();
	plantillasNodos.add("", plantillaNodoImagen);
	plantillasNodos.add("action", plantillaPictoAccion);
	plantillasNodos.add("person", plantillaPictoPersona);
	plantillasNodos.add("place", plantillaPictoLugar);
	diagrama.nodeTemplateMap = plantillasNodos;
	
	
	/***
		LINKS
	***/	
	// Plantilla de enlace con flecha
	var plantillaEnlace =
	$(go.Link,
		{ routing: go.Link.AvoidsNodes },  // link route should avoid nodes
		$(go.Shape),
		$(go.Shape, { toArrow: "Standard" })
	);
	
	// Como se hace uso de diferentes plantillas de enlaces es necesario guardarlas y asociarlas al diagrama
	 var plantillasEnlaces = new go.Map();
	plantillasEnlaces.add("enlace", plantillaEnlace);
	diagrama.linkTemplateMap = plantillasEnlaces;

	
	diagrama.model = $(go.GraphLinksModel,
		{
			nodeDataArray: [
				{ key: 1, source: "images/Pick-up-backpack.png", loc: "0 0", desiredSize: new go.Size(256, 256), category: "action" },
				{ source: "images/horaRestante.png", loc: "0 0", desiredSize: new go.Size(256, 256), text: "Leaving home at 10 minutes to 9:00" },
				{ source: "images/Go-to-school.png", loc: "0 0", desiredSize: new go.Size(256, 256), category: "action" },
				{ source: "images/nueve.png", loc: "0 0", desiredSize: new go.Size(256, 256), text: "School opening time at 9 a.m." },
				{ source: "images/fotoColeReal.jpeg", loc: "0 0", desiredSize: new go.Size(256, 256), text: "My school", category: "place" },
				{ source: "images/SocialStory.png", loc: "0 0", desiredSize: new go.Size(256, 256), text: "If there are people at the school entrance, say \"Good morning\"" },
				{ source: "images/Wait-until-opening.png", loc: "0 0", desiredSize: new go.Size(256, 256), category: "action" },
				{ source: "images/Peluche.png", loc: "0 0", desiredSize: new go.Size(256, 256) },
				{ source: "images/foto puerta clase real.jpeg", loc: "0 0", desiredSize: new go.Size(256, 256), text: "Third course classroom", category: "place" },
				{ source: "images/Enter.png", loc: "0 0", desiredSize: new go.Size(256, 256), category: "action" },
				{ source: "images/SocialStory.png", loc: "0 0", desiredSize: new go.Size(256, 256), text: "Greet the teacher, say \"Good morning\"" },
				{ source: "images/foto profe.jpg", loc: "0 0", desiredSize: new go.Size(256, 256), text: "Teacher (Ms. Olivia Brown)", category: "person" },
			]/*,
			linkDataArray: [
				{from: 1, to: 2, category: "enlace" }
			]*/
		});
		
	/***
		COMUNICACIÓN CLIENTE-SERVIDOR
		--- TOGETHERJS ---
	***/
	diagrama.model.addChangedListener(function(e) {
		if (e.isTransactionFinished) {
			var json = e.model.toIncrementalJson(e);
			
			if (TogetherJS.running) {
				TogetherJS.send({
					type: "content-send",
					output: json
				});
				console.log(json)
			}
		}
	});
	
	TogetherJS.hub.on("content-send", function(msg) {
		if (!msg.sameUrl) {
			return;
		}
		diagrama.model.applyIncrementalJson(msg.output);
		//diagram.isModified = false;
		console.log(msg.output);
	});	